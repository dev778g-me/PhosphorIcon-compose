package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.MicrosoftTeamsLogoBold: ImageVector
    get() {
        if (_MicrosoftTeamsLogoBold != null) {
            return _MicrosoftTeamsLogoBold!!
        }
        _MicrosoftTeamsLogoBold = ImageVector.Builder(
            name = "Bold.MicrosoftTeamsLogoBold",
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
                moveTo(36f, 68f)
                lineTo(140f, 68f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148f, 76f)
                lineTo(148f, 180f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140f, 188f)
                lineTo(36f, 188f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 180f)
                lineTo(28f, 76f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 68f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 104f)
                lineTo(72f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 152f)
                lineTo(88f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(106.33f, 68f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 148f, 85.67f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 88f)
                horizontalLineToRelative(36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(72f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 56f)
                horizontalLineToRelative(0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -52.32f, -36f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 88f)
                horizontalLineToRelative(39.26f)
                arcTo(4.74f, 4.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 228f, 92.74f)
                verticalLineTo(152f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -38.15f, 31.41f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(167.65f, 51.27f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 188f, 88f)
            }
        }.build()

        return _MicrosoftTeamsLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftTeamsLogoBold: ImageVector? = null
