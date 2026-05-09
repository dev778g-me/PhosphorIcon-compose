package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ArrowElbowRightDownBold: ImageVector
    get() {
        if (_ArrowElbowRightDownBold != null) {
            return _ArrowElbowRightDownBold!!
        }
        _ArrowElbowRightDownBold = ImageVector.Builder(
            name = "Bold.ArrowElbowRightDownBold",
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
                moveTo(128f, 160f)
                lineToRelative(48f, 48f)
                lineToRelative(48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 64f)
                lineToRelative(144f, 0f)
                lineToRelative(0f, 144f)
            }
        }.build()

        return _ArrowElbowRightDownBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightDownBold: ImageVector? = null
