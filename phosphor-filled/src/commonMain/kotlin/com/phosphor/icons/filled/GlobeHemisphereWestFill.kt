package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GlobeHemisphereWestFill: ImageVector
    get() {
        if (_GlobeHemisphereWestFill != null) {
            return _GlobeHemisphereWestFill!!
        }
        _GlobeHemisphereWestFill = ImageVector.Builder(
            name = "Filled.GlobeHemisphereWestFill",
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
                moveTo(216f, 128f)
                arcToRelative(87.62f, 87.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.4f, 32.94f)
                lineToRelative(-44.7f, -27.49f)
                arcToRelative(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.24f, -2.23f)
                lineToRelative(-22.82f, -3.08f)
                arcToRelative(16.11f, 16.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 7.86f)
                horizontalLineToRelative(-8.72f)
                lineToRelative(-3.8f, -7.86f)
                arcToRelative(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11f, -8.67f)
                lineToRelative(-8f, -1.73f)
                lineTo(96.14f, 104f)
                horizontalLineToRelative(16.71f)
                arcToRelative(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.73f, -2f)
                lineToRelative(12.25f, -6.76f)
                arcToRelative(16.62f, 16.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -2.14f)
                lineToRelative(26.91f, -24.34f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 166f, 49.1f)
                lineToRelative(-0.36f, -0.65f)
                arcTo(88.11f, 88.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 128f)
                close()
                moveTo(40f, 128f)
                arcToRelative(87.53f, 87.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.54f, -37.8f)
                lineToRelative(11.34f, 30.27f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.62f, 10f)
                lineToRelative(21.43f, 4.61f)
                lineTo(96.74f, 143f)
                arcToRelative(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.4f, 9f)
                horizontalLineToRelative(1.48f)
                lineToRelative(-7.23f, 16.23f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.86f, 17.37f)
                lineToRelative(0.14f, 0.14f)
                lineTo(128f, 205.94f)
                lineToRelative(-1.94f, 10f)
                arcTo(88.11f, 88.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 128f)
                close()
            }
        }.build()

        return _GlobeHemisphereWestFill!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeHemisphereWestFill: ImageVector? = null
