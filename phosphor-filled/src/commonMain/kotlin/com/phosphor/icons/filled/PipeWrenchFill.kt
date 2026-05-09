package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PipeWrenchFill: ImageVector
    get() {
        if (_PipeWrenchFill != null) {
            return _PipeWrenchFill!!
        }
        _PipeWrenchFill = ImageVector.Builder(
            name = "Filled.PipeWrenchFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(220.28f, 55f)
                lineToRelative(-0.17f, -0.17f)
                lineToRelative(-44.9f, -42.28f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.5f, 0.08f)
                lineTo(108.17f, 56.87f)
                lineToRelative(-1.54f, -1.56f)
                arcTo(25f, 25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 71.27f, 90.58f)
                lineToRelative(1.46f, 1.48f)
                lineTo(52.69f, 112f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.63f)
                lineToRelative(12.68f, 12.68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.59f, 0f)
                lineToRelative(19.93f, -19.65f)
                lineTo(120f, 140f)
                horizontalLineToRelative(0f)
                lineToRelative(0f, 0f)
                lineTo(55.31f, 205.37f)
                arcToRelative(25f, 25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 35.34f, 35.29f)
                lineToRelative(88.67f, -89.35f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.6f)
                lineTo(143.63f, 92.66f)
                lineTo(156.56f, 80f)
                lineToRelative(0.1f, 0.09f)
                lineTo(194f, 115.4f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.53f, -0.09f)
                lineToRelative(3.71f, -3.71f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -56.57f)
                close()
                moveTo(76.69f, 136f)
                lineTo(64f, 123.33f)
                lineToRelative(20f, -19.88f)
                lineToRelative(12.69f, 12.86f)
                close()
                moveTo(209f, 100.28f)
                lineTo(205.25f, 104f)
                arcToRelative(1.21f, 1.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.16f, -0.16f)
                lineTo(167.69f, 68.5f)
                arcToRelative(16.05f, 16.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.39f, 0.12f)
                lineTo(132.37f, 81.29f)
                lineTo(119.43f, 68.23f)
                lineTo(164f, 24f)
                lineToRelative(0.17f, 0.16f)
                lineToRelative(44.88f, 42.26f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.08f, 33.86f)
                close()
            }
        }.build()

        return _PipeWrenchFill!!
    }

@Suppress("ObjectPropertyName")
private var _PipeWrenchFill: ImageVector? = null
