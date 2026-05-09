package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BracketsCurlyFill: ImageVector
    get() {
        if (_BracketsCurlyFill != null) {
            return _BracketsCurlyFill!!
        }
        _BracketsCurlyFill = ImageVector.Builder(
            name = "Filled.BracketsCurlyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(88f, 155.84f)
                curveToRelative(0.29f, 14.26f, 0.41f, 20.16f, 16f, 20.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                curveToRelative(-31.27f, 0f, -31.72f, -22.43f, -32f, -35.84f)
                curveTo(71.71f, 141.9f, 71.59f, 136f, 56f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                curveToRelative(15.59f, 0f, 15.71f, -5.9f, 16f, -20.16f)
                curveTo(72.28f, 86.43f, 72.73f, 64f, 104f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                curveToRelative(-15.59f, 0f, -15.71f, 5.9f, -16f, 20.16f)
                curveToRelative(-0.17f, 8.31f, -0.41f, 20.09f, -8f, 27.84f)
                curveTo(87.59f, 135.75f, 87.83f, 147.53f, 88f, 155.84f)
                close()
                moveTo(200f, 136f)
                curveToRelative(-15.59f, 0f, -15.71f, 5.9f, -16f, 20.16f)
                curveToRelative(-0.28f, 13.41f, -0.73f, 35.84f, -32f, 35.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                curveToRelative(15.59f, 0f, 15.71f, -5.9f, 16f, -20.16f)
                curveToRelative(0.17f, -8.31f, 0.41f, -20.09f, 8f, -27.84f)
                curveToRelative(-7.6f, -7.75f, -7.84f, -19.53f, -8f, -27.84f)
                curveTo(167.71f, 85.9f, 167.59f, 80f, 152f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                curveToRelative(31.27f, 0f, 31.72f, 22.43f, 32f, 35.84f)
                curveToRelative(0.29f, 14.26f, 0.41f, 20.16f, 16f, 20.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _BracketsCurlyFill!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsCurlyFill: ImageVector? = null
