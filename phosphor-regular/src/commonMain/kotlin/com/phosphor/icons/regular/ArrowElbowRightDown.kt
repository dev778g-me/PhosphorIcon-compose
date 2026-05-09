package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.ArrowElbowRightDown: ImageVector
    get() {
        if (_ArrowElbowRightDown != null) {
            return _ArrowElbowRightDown!!
        }
        _ArrowElbowRightDown = ImageVector.Builder(
            name = "Regular.ArrowElbowRightDown",
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
                moveTo(128f, 160f)
                lineToRelative(48f, 48f)
                lineToRelative(48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 64f)
                lineToRelative(144f, 0f)
                lineToRelative(0f, 144f)
            }
        }.build()

        return _ArrowElbowRightDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightDown: ImageVector? = null
