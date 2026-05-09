package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GavelFill: ImageVector
    get() {
        if (_GavelFill != null) {
            return _GavelFill!!
        }
        _GavelFill = ImageVector.Builder(
            name = "Filled.GavelFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(52.69f, 99.31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -22.63f)
                lineToRelative(64f, -64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.63f, 22.63f)
                lineToRelative(-64f, 64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.63f, 0f)
                close()
                moveTo(243.32f, 116.68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 0f)
                lineToRelative(-64f, 64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.63f)
                horizontalLineToRelative(0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.63f, 0f)
                lineToRelative(64f, -64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 243.32f, 116.68f)
                close()
                moveTo(208.21f, 100.88f)
                lineTo(155.12f, 47.79f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 0f)
                lineTo(87.8f, 109.45f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.66f)
                lineTo(103f, 130.34f)
                lineTo(28.69f, 204.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.62f, 22.62f)
                lineTo(125.66f, 153f)
                lineToRelative(15.23f, 15.23f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, 0f)
                lineToRelative(61.66f, -61.66f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208.21f, 100.88f)
                close()
            }
        }.build()

        return _GavelFill!!
    }

@Suppress("ObjectPropertyName")
private var _GavelFill: ImageVector? = null
