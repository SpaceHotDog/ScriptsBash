# ~/.bashrc: executed by bash(1) for non-login shells.
# see /usr/share/doc/bash/examples/startup-files (in the package bash-doc)
# for examples

# If not running interactively, don't do anything
case $- in
    *i*) ;;
      *) return;;
esac

# don't put duplicate lines or lines starting with space in the history.
# See bash(1) for more options
HISTCONTROL=ignoreboth

# append to the history file, don't overwrite it
shopt -s histappend

# for setting history length see HISTSIZE and HISTFILESIZE in bash(1)
HISTSIZE=10000
HISTFILESIZE=20000

# check the window size after each command and, if necessary,
# update the values of LINES and COLUMNS.
shopt -s checkwinsize

# If set, the pattern "**" used in a pathname expansion context will
# match all files and zero or more directories and subdirectories.
#shopt -s globstar

# make less more friendly for non-text input files, see lesspipe(1)
[ -x /usr/bin/lesspipe ] && eval "$(SHELL=/bin/sh lesspipe)"

# set variable identifying the chroot you work in (used in the prompt below)
if [ -z "${debian_chroot:-}" ] && [ -r /etc/debian_chroot ]; then
    debian_chroot=$(cat /etc/debian_chroot)
fi

# set a fancy prompt (non-color, unless we know we "want" color)
case "$TERM" in
    xterm-color|*-256color) color_prompt=yes;;
esac

# uncomment for a colored prompt, if the terminal has the capability; turned
# off by default to not distract the user: the focus in a terminal window
# should be on the output of commands, not on the prompt
#force_color_prompt=yes

if [ -n "$force_color_prompt" ]; then
    if [ -x /usr/bin/tput ] && tput setaf 1 >&/dev/null; then
	# We have color support; assume it's compliant with Ecma-48
	# (ISO/IEC-6429). (Lack of such support is extremely rare, and such
	# a case would tend to support setf rather than setaf.)
	color_prompt=yes
    else
	color_prompt=
    fi
fi

if [ "$color_prompt" = yes ]; then
    PS1='${debian_chroot:+($debian_chroot)}\[\033[01;32m\]\u@\h\[\033[00m\]:\[\033[01;34m\]\w\[\033[00m\]\$ '
else
    PS1='${debian_chroot:+($debian_chroot)}\u@\h:\w\$ '
fi
unset color_prompt force_color_prompt

# If this is an xterm set the title to user@host:dir
case "$TERM" in
xterm*|rxvt*)
    PS1="\[\e]0;${debian_chroot:+($debian_chroot)}\u@\h: \w\a\]$PS1"
    ;;
*)
    ;;
esac

# enable color support of ls and also add handy aliases
if [ -x /usr/bin/dircolors ]; then
    test -r ~/.dircolors && eval "$(dircolors -b ~/.dircolors)" || eval "$(dircolors -b)"
    alias ls='ls --color=auto'
    #alias dir='dir --color=auto'
    #alias vdir='vdir --color=auto'

    alias grep='grep --color=auto'
    alias fgrep='fgrep --color=auto'
    alias egrep='egrep --color=auto'
fi

# colored GCC warnings and errors
#export GCC_COLORS='error=01;31:warning=01;35:note=01;36:caret=01;32:locus=01:quote=01'

# some more ls aliases
alias ll='ls -alF'
alias la='ls -A'
alias l='ls -CF'
alias navicat='nohup wine .wine/drive_c/Program\ Files/PremiumSoft/Navicat\ Premium/navicat.exe &'
alias pycharm='nohup sh /home/usr1/Descargas/pycharm-community-2017.2.4/bin/pycharm.sh &'
alias robomongo='nohup /home/usr1/robomongo/bin/robomongo &'
alias python=python3.6
alias unity3d='nohup ~/Unity-2017.3.0b1/Editor/Unity &'
alias frequent_command='/bin/bash /home/usr1/ScriptsBash/frequent_command.sh > /dev/pts/0'
alias jupynote='nohup jupyter-notebook &'
alias eclipse='nohup /home/usr1/eclipse/committers-oxygen/eclipse/eclipse &'

# SSH PROD
alias j1='ssh nsolignac@192.168.33.152'
alias j2='ssh nsolignac@192.168.33.159'
alias dap='ssh soporte@192.168.33.147'
alias procs='ssh nsolignac@192.168.33.154'
alias bb2='ssh soporte@192.168.9.84'
alias report='ssh nsolignac@192.168.33.146'
alias p1='ssh nsolignac@192.168.9.181'
alias p2='ssh nsolignac@192.168.9.178'
alias p3='ssh nsolignac@192.168.33.161'
alias cmpw='ssh nsolignac@192.168.35.112'
alias hedw='ssh nsolignac@192.168.33.178'
alias f21='ssh nsolignac@192.168.9.34'
alias f22='ssh nsolignac@192.168.9.196'
alias f23='ssh nsolignac@192.168.9.105'
alias f24='ssh nsolignac@192.168.9.62'
alias vls='ssh nsolignac@192.168.9.92'
alias p4='ssh nsolignac@192.168.34.102'
alias mcapi='ssh nsolignac@192.168.33.172'
alias aasterisk='ssh nsolignac@192.168.33.182'
alias celco1='ssh nsolignac@192.168.33.134'
alias celco2='ssh nsolignac@192.168.33.135'
alias pso='ssh nsolignac@192.168.34.134'
alias cmpcron='ssh nsolignac@192.168.33.148'
alias j3='ssh nsolignac@192.168.33.115'

# SSH QA OLD
alias qasterisk='ssh root@192.168.10.110'
alias qaprocs='ssh root@192.168.10.28'
alias qadbs='ssh root@192.168.10.87'
alias qaw='ssh root@192.168.10.29'

# SSH QA
alias wsaqa='ssh appuser@192.168.20.109' #WSAdapter - ServicioCelco
alias waqa='ssh appuser@192.168.20.108' #WebAdapter - Adapter
alias wqa='ssh appuser@192.168.20.105' #Web
alias procqa='ssh appuser@192.168.20.110' #ProcFTP - ProcCreditos - ProcCampanaSMS - ProcCampanaAudio
alias reporqa='ssh appuser@192.168.20.113' #ProcReportes
alias f2wqa='ssh appuser@192.168.20.114' #Frontera2 Web
alias monqa='ssh appuser@192.168.20.111' #MongoDB
alias sqlqa='ssh appuser@192.168.20.106' #Frontera2 SQL - CMP SQL
alias amqqa='ssh appuser@192.168.20.112' #ActiveMQ

# Add an "alert" alias for long running commands.  Use like so:
#   sleep 10; alert
alias alert='notify-send --urgency=low -i "$([ $? = 0 ] && echo terminal || echo error)" "$(history|tail -n1|sed -e '\''s/^\s*[0-9]\+\s*//;s/[;&|]\s*alert$//'\'')"'

# Alias definitions.
# You may want to put all your additions into a separate file like
# ~/.bash_aliases, instead of adding them here directly.
# See /usr/share/doc/bash-doc/examples in the bash-doc package.

if [ -f ~/.bash_aliases ]; then
    . ~/.bash_aliases
fi

# enable programmable completion features (you don't need to enable
# this, if it's already enabled in /etc/bash.bashrc and /etc/profile
# sources /etc/bash.bashrc).
if ! shopt -oq posix; then
  if [ -f /usr/share/bash-completion/bash_completion ]; then
    . /usr/share/bash-completion/bash_completion
  elif [ -f /etc/bash_completion ]; then
    . /etc/bash_completion
  fi
fi

if [ -f ~/.local/lib/python2.7/site-packages/powerline/bindings/bash/powerline.sh ]; then
    source ~/.local/lib/python2.7/site-packages/powerline/bindings/bash/powerline.sh
fi

JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64
export JAVA_HOME

PATH=$PATH:$JAVA_HOME
export PATH