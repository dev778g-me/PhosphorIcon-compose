package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.EqualizerFill: ImageVector
    get() {
        if (_EqualizerFill != null) {
            return _EqualizerFill!!
        }
        _EqualizerFill = ImageVector.Builder(
            name = "Filled.EqualizerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(80f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(24f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(72f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 96f)
                close()
                moveTo(152f, 120f)
                lineTo(104f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(184f, 72f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(184f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
                moveTo(72f, 120f)
                lineTo(24f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(72f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(80f, 128f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 120f)
                close()
                moveTo(232f, 88f)
                lineTo(184f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(240f, 96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 88f)
                close()
                moveTo(152f, 152f)
                lineTo(104f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(160f, 160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 152f)
                close()
            }
        }.build()

        return _EqualizerFill!!
    }

@Suppress("ObjectPropertyName")
private var _EqualizerFill: ImageVector? = null
