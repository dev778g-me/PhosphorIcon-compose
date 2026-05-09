package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AxeFill: ImageVector
    get() {
        if (_AxeFill != null) {
            return _AxeFill!!
        }
        _AxeFill = ImageVector.Builder(
            name = "Filled.AxeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(255.15f, 97.72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 242f, 86.94f)
                arcToRelative(136.46f, 136.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -51.65f, -18f)
                lineToRelative(10.31f, -10.3f)
                arcToRelative(25f, 25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -35.32f, -35.32f)
                lineToRelative(-13.2f, 13.21f)
                curveToRelative(-2.33f, -2.8f, -3.81f, -4.84f, -4.41f, -5.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24.41f, -2.15f)
                lineTo(84.68f, 67.36f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.14f, 24.4f)
                curveToRelative(0.86f, 0.6f, 2.9f, 2.08f, 5.7f, 4.41f)
                lineTo(7.31f, 181.37f)
                arcToRelative(25f, 25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 35.32f, 35.32f)
                lineToRelative(82.3f, -82.31f)
                arcToRelative(136.63f, 136.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 51.65f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.77f, 13.12f)
                arcToRelative(16.21f, 16.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.15f, 0.85f)
                arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.26f, -4.69f)
                lineToRelative(81.18f, -81.19f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 255.15f, 97.72f)
                close()
                moveTo(241f, 94.87f)
                close()
                moveTo(176.69f, 34.63f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.68f, 12.68f)
                lineTo(176.82f, 59.86f)
                arcTo(152.5f, 152.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 163.1f, 48.21f)
                close()
                moveTo(31.31f, 205.37f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.68f, -12.68f)
                lineToRelative(85.58f, -85.58f)
                arcToRelative(149.75f, 149.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.65f, 13.72f)
                close()
            }
        }.build()

        return _AxeFill!!
    }

@Suppress("ObjectPropertyName")
private var _AxeFill: ImageVector? = null
