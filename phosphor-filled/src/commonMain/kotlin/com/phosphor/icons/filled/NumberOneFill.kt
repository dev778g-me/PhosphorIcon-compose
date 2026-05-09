package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberOneFill: ImageVector
    get() {
        if (_NumberOneFill != null) {
            return _NumberOneFill!!
        }
        _NumberOneFill = ImageVector.Builder(
            name = "Filled.NumberOneFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 24f)
                horizontalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                close()
                moveTo(144f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(84.94f)
                lineTo(107.58f, 95.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.16f, -14.32f)
                lineToRelative(32f, -16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 72f)
                close()
            }
        }.build()

        return _NumberOneFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberOneFill: ImageVector? = null
