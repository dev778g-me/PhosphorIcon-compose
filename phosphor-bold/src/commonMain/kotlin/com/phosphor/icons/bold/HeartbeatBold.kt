package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.HeartbeatBold: ImageVector
    get() {
        if (_HeartbeatBold != null) {
            return _HeartbeatBold!!
        }
        _HeartbeatBold = ImageVector.Builder(
            name = "Bold.HeartbeatBold",
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
                moveTo(32f, 136f)
                lineToRelative(40f, 0f)
                lineToRelative(16f, -24f)
                lineToRelative(32f, 48f)
                lineToRelative(16f, -24f)
                lineToRelative(24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24.33f, 96f)
                arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 48f)
                curveToRelative(22.59f, 0f, 41.94f, 12.31f, 50f, 32f)
                curveToRelative(8.06f, -19.69f, 27.41f, -32f, 50f, -32f)
                arcToRelative(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 54f, 54f)
                curveToRelative(0f, 66f, -104f, 122f, -104f, 122f)
                reflectiveCurveToRelative(-35.36f, -19f, -64.84f, -48f)
            }
        }.build()

        return _HeartbeatBold!!
    }

@Suppress("ObjectPropertyName")
private var _HeartbeatBold: ImageVector? = null
