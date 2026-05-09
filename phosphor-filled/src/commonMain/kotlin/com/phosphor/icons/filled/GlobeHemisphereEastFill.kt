package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GlobeHemisphereEastFill: ImageVector
    get() {
        if (_GlobeHemisphereEastFill != null) {
            return _GlobeHemisphereEastFill!!
        }
        _GlobeHemisphereEastFill = ImageVector.Builder(
            name = "Filled.GlobeHemisphereEastFill",
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
                moveTo(62.29f, 186.47f)
                lineToRelative(2.52f, -1.65f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 171.53f)
                lineToRelative(0.21f, -36.23f)
                lineTo(93.17f, 104f)
                arcToRelative(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.32f, 0.22f)
                lineToRelative(19.67f, 12.87f)
                arcToRelative(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.35f, 2.77f)
                lineTo(156f, 115.59f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, -5.41f)
                lineToRelative(22.17f, -25.76f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 74f)
                verticalLineTo(67.67f)
                arcTo(87.87f, 87.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 211.77f, 155f)
                lineToRelative(-16.14f, -14.76f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16.93f, -3f)
                lineToRelative(-30.46f, 12.65f)
                arcToRelative(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.68f, 12.45f)
                lineToRelative(-2.39f, 16.19f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.77f, 17.81f)
                lineTo(169.4f, 202f)
                lineToRelative(2.36f, 2.37f)
                arcTo(87.88f, 87.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.29f, 186.47f)
                close()
            }
        }.build()

        return _GlobeHemisphereEastFill!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeHemisphereEastFill: ImageVector? = null
