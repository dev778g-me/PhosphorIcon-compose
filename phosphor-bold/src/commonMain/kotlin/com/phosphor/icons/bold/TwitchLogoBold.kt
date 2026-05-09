package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.TwitchLogoBold: ImageVector
    get() {
        if (_TwitchLogoBold != null) {
            return _TwitchLogoBold!!
        }
        _TwitchLogoBold = ImageVector.Builder(
            name = "Bold.TwitchLogoBold",
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
                moveTo(165.1f, 200f)
                horizontalLineTo(120f)
                lineTo(72f, 240f)
                verticalLineTo(200f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(156.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.88f, 6.15f)
                lineToRelative(-42.89f, 35.75f)
                arcTo(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 165.1f, 200f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 88f)
                lineTo(168f, 136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 88f)
                lineTo(120f, 136f)
            }
        }.build()

        return _TwitchLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _TwitchLogoBold: ImageVector? = null
