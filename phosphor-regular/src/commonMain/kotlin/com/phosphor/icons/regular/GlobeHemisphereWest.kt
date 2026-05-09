package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.GlobeHemisphereWest: ImageVector
    get() {
        if (_GlobeHemisphereWest != null) {
            return _GlobeHemisphereWest!!
        }
        _GlobeHemisphereWest = ImageVector.Builder(
            name = "Regular.GlobeHemisphereWest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(75.88f, 123.26f)
                lineTo(89.2f, 100f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.94f, -4f)
                horizontalLineToRelative(16.71f)
                arcToRelative(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.86f, -1f)
                lineTo(129f, 88.24f)
                arcToRelative(7.12f, 7.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.49f, -1.07f)
                lineToRelative(26.92f, -24.33f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 159f, 53f)
                lineToRelative(-10.5f, -18.81f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(67.78f, 53.23f)
                lineTo(56f, 81.08f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 55.88f, 87f)
                lineToRelative(11.5f, 30.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.81f, 5f)
                lineToRelative(21.43f, 4.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.52f, 4.33f)
                lineToRelative(3.8f, 7.87f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, 4.51f)
                horizontalLineToRelative(13.8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(213.09f, 172.48f)
                lineToRelative(-52.38f, -32.22f)
                arcToRelative(8.11f, 8.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.12f, -1.11f)
                lineToRelative(-22.82f, -3.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.38f, 4.67f)
                lineToRelative(-13.7f, 30.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.44f, 8.69f)
                lineToRelative(19.74f, 20.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 6.95f)
                lineToRelative(-3.17f, 16.44f)
            }
        }.build()

        return _GlobeHemisphereWest!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeHemisphereWest: ImageVector? = null
