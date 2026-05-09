package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.StackOverflowLogoBold: ImageVector
    get() {
        if (_StackOverflowLogoBold != null) {
            return _StackOverflowLogoBold!!
        }
        _StackOverflowLogoBold = ImageVector.Builder(
            name = "Bold.StackOverflowLogoBold",
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
                moveTo(48f, 152f)
                lineToRelative(0f, 64f)
                lineToRelative(160f, 0f)
                lineToRelative(0f, -64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 172f)
                lineTo(168f, 172f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(100.3f, 102.23f)
                lineTo(175.48f, 129.59f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(135.73f, 40.87f)
                lineTo(197.01f, 92.29f)
            }
        }.build()

        return _StackOverflowLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _StackOverflowLogoBold: ImageVector? = null
