package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PianoKeysFill: ImageVector
    get() {
        if (_PianoKeysFill != null) {
            return _PianoKeysFill!!
        }
        _PianoKeysFill = ImageVector.Builder(
            name = "Filled.PianoKeysFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(88f, 208f)
                lineTo(48f, 208f)
                lineTo(48f, 48f)
                lineTo(72f, 48f)
                verticalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(8f)
                close()
                moveTo(152f, 208f)
                lineTo(104f, 208f)
                lineTo(104f, 152f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(120f, 48f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(8f)
                close()
                moveTo(208f, 208f)
                lineTo(168f, 208f)
                lineTo(168f, 152f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(184f, 48f)
                horizontalLineToRelative(24f)
                lineTo(208f, 208f)
                close()
            }
        }.build()

        return _PianoKeysFill!!
    }

@Suppress("ObjectPropertyName")
private var _PianoKeysFill: ImageVector? = null
