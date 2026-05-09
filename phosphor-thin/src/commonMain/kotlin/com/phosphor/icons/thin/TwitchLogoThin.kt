package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.TwitchLogoThin: ImageVector
    get() {
        if (_TwitchLogoThin != null) {
            return _TwitchLogoThin!!
        }
        _TwitchLogoThin = ImageVector.Builder(
            name = "Thin.TwitchLogoThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
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
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 88f)
                lineTo(168f, 136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 88f)
                lineTo(120f, 136f)
            }
        }.build()

        return _TwitchLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _TwitchLogoThin: ImageVector? = null
