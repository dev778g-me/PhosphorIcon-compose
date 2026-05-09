package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GlobeSimpleXFill: ImageVector
    get() {
        if (_GlobeSimpleXFill != null) {
            return _GlobeSimpleXFill!!
        }
        _GlobeSimpleXFill = ImageVector.Builder(
            name = "Filled.GlobeSimpleXFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.66f, 173.66f)
                lineTo(203.31f, 192f)
                lineToRelative(18.35f, 18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(192f, 203.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(180.69f, 192f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineTo(192f, 180.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                close()
                moveTo(232f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(96.25f)
                curveToRelative(3f, 53.73f, 35.33f, 80.6f, 36.77f, 81.77f)
                horizontalLineToRelative(0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 232f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(148.41f, 42.4f)
                curveTo(159.94f, 57.67f, 174f, 83.49f, 175.79f, 120f)
                horizontalLineToRelative(39.84f)
                arcTo(88.19f, 88.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 148.41f, 42.4f)
                close()
                moveTo(96.23f, 120f)
                horizontalLineToRelative(63.54f)
                curveTo(157.46f, 78.4f, 137.55f, 52.9f, 128f, 43f)
                curveTo(118.46f, 52.89f, 98.54f, 78.39f, 96.23f, 120f)
                close()
            }
        }.build()

        return _GlobeSimpleXFill!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeSimpleXFill: ImageVector? = null
