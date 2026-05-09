package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.VoicemailFill: ImageVector
    get() {
        if (_VoicemailFill != null) {
            return _VoicemailFill!!
        }
        _VoicemailFill = ImageVector.Builder(
            name = "Filled.VoicemailFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 72f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -39.14f, 96f)
                lineTo(95.14f, 168f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, 56f, 184f)
                lineTo(200f, 184f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -112f)
                close()
                moveTo(56f, 168f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 168f)
                close()
                moveTo(200f, 168f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 168f)
                close()
                moveTo(224f, 128f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                close()
                moveTo(80f, 128f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 128f)
                close()
            }
        }.build()

        return _VoicemailFill!!
    }

@Suppress("ObjectPropertyName")
private var _VoicemailFill: ImageVector? = null
