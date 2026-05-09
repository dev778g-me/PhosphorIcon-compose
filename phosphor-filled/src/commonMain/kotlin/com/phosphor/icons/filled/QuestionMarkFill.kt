package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.QuestionMarkFill: ImageVector
    get() {
        if (_QuestionMarkFill != null) {
            return _QuestionMarkFill!!
        }
        _QuestionMarkFill = ImageVector.Builder(
            name = "Filled.QuestionMarkFill",
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
                moveTo(136f, 143.28f)
                verticalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                curveToRelative(13.23f, 0f, 24f, -9f, 24f, -20f)
                reflectiveCurveToRelative(-10.77f, -20f, -24f, -20f)
                reflectiveCurveToRelative(-24f, 9f, -24f, 20f)
                verticalLineToRelative(4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -19.85f, 17.94f, -36f, 40f, -36f)
                reflectiveCurveToRelative(40f, 16.15f, 40f, 36f)
                curveTo(168f, 125.38f, 154.23f, 139.93f, 136f, 143.28f)
                close()
                moveTo(140f, 180f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140f, 180f)
                close()
            }
        }.build()

        return _QuestionMarkFill!!
    }

@Suppress("ObjectPropertyName")
private var _QuestionMarkFill: ImageVector? = null
