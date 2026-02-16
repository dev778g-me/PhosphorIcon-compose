package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.CoinsDuotone: ImageVector
    get() {
        if (_CoinsDuotone != null) {
            return _CoinsDuotone!!
        }
        _CoinsDuotone = ImageVector.Builder(
            name = "Duotone.CoinsDuotone",
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
                moveTo(176f, 96.72f)
                horizontalLineToRelative(0f)
                verticalLineTo(124f)
                curveToRelative(0f, 18f, -29.24f, 32.85f, -67.47f, 35.56f)
                horizontalLineToRelative(0f)
                curveTo(122.44f, 164.83f, 140.4f, 168f, 160f, 168f)
                curveToRelative(44.18f, 0f, 80f, -16.12f, 80f, -36f)
                curveTo(240f, 114.58f, 212.52f, 100.06f, 176f, 96.72f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(16f, 84f)
                arcToRelative(80f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 160f, 0f)
                arcToRelative(80f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, -160f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 84f)
                arcToRelative(80f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 160f, 0f)
                arcToRelative(80f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, -160f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 84f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 19.88f, 35.82f, 36f, 80f, 36f)
                reflectiveCurveToRelative(80f, -16.12f, 80f, -36f)
                verticalLineTo(84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 117f)
                lineTo(64f, 157f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 96.72f)
                curveToRelative(36.52f, 3.34f, 64f, 17.86f, 64f, 35.28f)
                curveToRelative(0f, 19.88f, -35.82f, 36f, -80f, 36f)
                curveToRelative(-19.6f, 0f, -37.56f, -3.17f, -51.47f, -8.44f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 159.28f)
                verticalLineTo(172f)
                curveToRelative(0f, 19.88f, 35.82f, 36f, 80f, 36f)
                reflectiveCurveToRelative(80f, -16.12f, 80f, -36f)
                verticalLineTo(132f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 165f)
                lineTo(192f, 205f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 117f)
                lineTo(128f, 205f)
            }
        }.build()

        return _CoinsDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CoinsDuotone: ImageVector? = null
