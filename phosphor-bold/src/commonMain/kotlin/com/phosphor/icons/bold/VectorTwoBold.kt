package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.VectorTwoBold: ImageVector
    get() {
        if (_VectorTwoBold != null) {
            return _VectorTwoBold!!
        }
        _VectorTwoBold = ImageVector.Builder(
            name = "Bold.VectorTwoBold",
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
                moveTo(224f, 192f)
                lineToRelative(-144f, 0f)
                lineToRelative(0f, -152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 160f)
                lineToRelative(32f, 32f)
                lineToRelative(-32f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 72f)
                lineToRelative(32f, -32f)
                lineToRelative(32f, 32f)
            }
        }.build()

        return _VectorTwoBold!!
    }

@Suppress("ObjectPropertyName")
private var _VectorTwoBold: ImageVector? = null
