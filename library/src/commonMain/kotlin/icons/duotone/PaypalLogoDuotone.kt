package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.PaypalLogoDuotone: ImageVector
    get() {
        if (_PaypalLogoDuotone != null) {
            return _PaypalLogoDuotone!!
        }
        _PaypalLogoDuotone = ImageVector.Builder(
            name = "Duotone.PaypalLogoDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(176f, 80f)
                horizontalLineTo(120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.76f, 6.06f)
                lineToRelative(-12f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108f, 128f)
                horizontalLineToRelative(36f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 46.56f, -36.36f)
                horizontalLineToRelative(0f)
                arcToRelative(49f, 49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.37f, -8.94f)
                arcTo(48.25f, 48.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 128f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 46.56f, -36.36f)
                horizontalLineToRelative(0f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 32f)
                horizontalLineTo(84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.76f, 6.06f)
                lineToRelative(-36f, 144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 192f)
                horizontalLineTo(79.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, -6.06f)
                lineToRelative(13f, -51.88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108f, 128f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(87.27f, 185.94f)
                lineToRelative(-7f, 28.12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 224f)
                horizontalLineToRelative(31.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, -6.06f)
                lineToRelative(9f, -35.88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 176f)
                horizontalLineToRelative(32f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 46.56f, -36.36f)
                horizontalLineToRelative(0f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 80f)
                horizontalLineTo(120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.76f, 6.06f)
                lineToRelative(-12f, 48f)
            }
        }.build()

        return _PaypalLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PaypalLogoDuotone: ImageVector? = null
