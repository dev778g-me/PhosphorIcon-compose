package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.DiscordLogoLight: ImageVector
    get() {
        if (_DiscordLogoLight != null) {
            return _DiscordLogoLight!!
        }
        _DiscordLogoLight = ImageVector.Builder(
            name = "Light.DiscordLogoLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 78.31f)
                arcTo(178.94f, 178.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 72f)
                arcToRelative(178.94f, 178.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 6.31f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 177.69f)
                arcTo(178.94f, 178.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 184f)
                arcToRelative(178.94f, 178.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -6.31f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(92f, 140f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(164f, 140f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(153.44f, 73.69f)
                lineToRelative(5f, -19.63f)
                arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.21f, -6f)
                lineTo(203.69f, 54f)
                arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 210.23f, 60f)
                lineToRelative(29.53f, 116.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.55f, 9.24f)
                lineToRelative(-67f, 29.7f)
                arcToRelative(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11f, -4.56f)
                lineTo(147f, 183.06f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(102.56f, 73.69f)
                lineToRelative(-5f, -19.63f)
                arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.21f, -6f)
                lineTo(52.31f, 54f)
                arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45.77f, 60f)
                lineTo(16.24f, 176.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.55f, 9.24f)
                lineToRelative(67f, 29.7f)
                arcToRelative(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, -4.56f)
                lineTo(109f, 183.06f)
            }
        }.build()

        return _DiscordLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _DiscordLogoLight: ImageVector? = null
