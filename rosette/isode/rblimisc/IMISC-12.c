/* automatically generated by pepy 7.0 #14 (nanook.mcc.com), do not edit! */

#include "psap.h"

#define	advise	PY_advise

void	advise ();

/* Generated from module IMISC */

#include <stdio.h>
#include "IMISC-types.h"

#ifndef PEPYPARM
#define PEPYPARM char *
#endif /* PEPYPARM */
extern PEPYPARM NullParm;

/* ARGSUSED */

int	decode_IMISC_Empty (pe, explicit, len, buffer, parm)
PE	pe;
int	explicit;
int    *len;
char  **buffer;
struct type_IMISC_Empty ** parm;
{
#ifdef DEBUG
    (void) testdebug (pe, "IMISC.Empty");
#endif

    if (explicit) {
        if (pe -> pe_class != PE_CLASS_UNIV || pe -> pe_id != PE_PRIM_NULL) {
            advise (NULLCP, "Empty bad class/form/id: %s/%d/0x%x",
                    pe_classlist[pe -> pe_class], pe -> pe_form, pe -> pe_id);
            return NOTOK;
        }
    }

    {
# line 81 "IMISC-types.py"

        if ((*(parm) = (struct type_IMISC_Empty *)
                calloc (1, sizeof **(parm))) == ((struct type_IMISC_Empty *) 0)) {
            advise (NULLCP, "%s", PEPY_ERR_NOMEM);
            return NOTOK;
        }
    
    }

    return OK;
}