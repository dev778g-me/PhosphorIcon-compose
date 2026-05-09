package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.DiscordLogoBold: ImageVector
    get() {
        if (_DiscordLogoBold != null) {
            return _DiscordLogoBold!!
        }
        _DiscordLogoBold = ImageVector.Builder(
            name = "Bold.DiscordLogoBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(92f, 136f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(164f, 136f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(151.47f, 81.43f)
                lineToRelative(6.95f, -27.37f)
                arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.21f, -6f)
                lineTo(203.69f, 54f)
                arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 210.23f, 60f)
                lineToRelative(29.53f, 116.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.55f, 9.24f)
                lineToRelative(-67f, 29.7f)
                arcToRelative(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11f, -4.56f)
                lineTo(145.61f, 179.2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104.53f, 81.43f)
                lineToRelative(-7f, -27.37f)
                arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.21f, -6f)
                lineTo(52.31f, 54f)
                arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45.77f, 60f)
                lineTo(16.24f, 176.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.55f, 9.24f)
                lineToRelative(67f, 29.7f)
                arcToRelative(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, -4.56f)
                lineToRelative(11.64f, -31.53f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(84f, 85.24f)
                arcTo(181.44f, 181.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 80f)
                arcToRelative(181.44f, 181.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, 5.24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(172f, 174.76f)
                arcTo(181.44f, 181.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 180f)
                arcToRelative(181.44f, 181.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -44f, -5.24f)
            }
        }.build()

        return _DiscordLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _DiscordLogoBold: ImageVector? = null
