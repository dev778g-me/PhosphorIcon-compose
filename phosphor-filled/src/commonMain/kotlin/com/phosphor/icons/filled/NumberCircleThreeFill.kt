package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberCircleThreeFill: ImageVector
    get() {
        if (_NumberCircleThreeFill != null) {
            return _NumberCircleThreeFill!!
        }
        _NumberCircleThreeFill = ImageVector.Builder(
            name = "Filled.NumberCircleThreeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(124f, 188f)
                arcToRelative(35.71f, 35.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -25.71f, -10.81f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 109.71f, 166f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, 124f, 132f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.55f, -12.59f)
                lineTo(136.63f, 92f)
                lineTo(104f, 92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.55f, 12.59f)
                lineToRelative(-21f, 30f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124f, 188f)
                close()
            }
        }.build()

        return _NumberCircleThreeFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleThreeFill: ImageVector? = null
