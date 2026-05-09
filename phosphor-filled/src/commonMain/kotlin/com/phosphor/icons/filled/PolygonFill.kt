package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PolygonFill: ImageVector
    get() {
        if (_PolygonFill != null) {
            return _PolygonFill!!
        }
        _PolygonFill = ImageVector.Builder(
            name = "Filled.PolygonFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(227.81f, 52.19f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -39.6f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(28.14f, 28.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 5f)
                lineTo(148f, 47.33f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 100.2f, 28.19f)
                horizontalLineToRelative(0f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 94.7f, 60f)
                lineTo(54.58f, 96.1f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -34.39f, 4.1f)
                horizontalLineToRelative(0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36.7f, 42.12f)
                lineToRelative(76.75f, 56.28f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 46.17f, -10.39f)
                arcToRelative(27.66f, 27.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.33f, -2.84f)
                lineTo(206.63f, 100f)
                quadToRelative(0.69f, 0f, 1.38f, 0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.8f, -47.79f)
                close()
                moveTo(161.39f, 180.05f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.29f, 5.64f)
                lineTo(66.36f, 129.41f)
                arcTo(28.15f, 28.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 65.29f, 108f)
                lineToRelative(40.12f, -36.11f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 38.37f, -9.12f)
                lineTo(180f, 72.66f)
                arcToRelative(27.88f, 27.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.17f, 19.13f)
                arcToRelative(28.61f, 28.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.32f, 2.85f)
                close()
            }
        }.build()

        return _PolygonFill!!
    }

@Suppress("ObjectPropertyName")
private var _PolygonFill: ImageVector? = null
