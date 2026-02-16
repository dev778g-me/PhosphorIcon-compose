package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.GithubLogoLight: ImageVector
    get() {
        if (_GithubLogoLight != null) {
            return _GithubLogoLight!!
        }
        _GithubLogoLight = ImageVector.Builder(
            name = "Light.GithubLogoLight",
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
                moveTo(119.83f, 56f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 76f, 32f)
                arcToRelative(51.92f, 51.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.49f, 44.7f)
                arcTo(49.28f, 49.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 104f)
                verticalLineToRelative(8f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
                horizontalLineToRelative(48f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48f)
                verticalLineToRelative(-8f)
                arcToRelative(49.28f, 49.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.51f, -27.3f)
                arcTo(51.92f, 51.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 196f, 32f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -43.83f, 24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 232f)
                verticalLineTo(192f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                horizontalLineToRelative(0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                verticalLineToRelative(40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 208f)
                horizontalLineTo(72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 144f)
            }
        }.build()

        return _GithubLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _GithubLogoLight: ImageVector? = null
