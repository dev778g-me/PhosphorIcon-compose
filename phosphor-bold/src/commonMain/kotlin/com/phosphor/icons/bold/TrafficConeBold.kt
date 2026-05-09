package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.TrafficConeBold: ImageVector
    get() {
        if (_TrafficConeBold != null) {
            return _TrafficConeBold!!
        }
        _TrafficConeBold = ImageVector.Builder(
            name = "Bold.TrafficConeBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 216f)
                lineTo(110.13f, 37.37f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 117.69f, 32f)
                horizontalLineToRelative(20.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.56f, 5.37f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 216f)
                lineTo(24f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(166.26f, 96f)
                lineTo(89.74f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(188.52f, 160f)
                lineTo(67.48f, 160f)
            }
        }.build()

        return _TrafficConeBold!!
    }

@Suppress("ObjectPropertyName")
private var _TrafficConeBold: ImageVector? = null
