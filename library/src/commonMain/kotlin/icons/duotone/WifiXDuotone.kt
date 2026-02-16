package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.WifiXDuotone: ImageVector
    get() {
        if (_WifiXDuotone != null) {
            return _WifiXDuotone!!
        }
        _WifiXDuotone = ImageVector.Builder(
            name = "Duotone.WifiXDuotone",
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
                moveTo(224f, 56f)
                lineTo(176f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 104f)
                lineTo(176f, 56f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(224f, 104f)
                lineTo(165.23f, 45.23f)
                arcTo(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 161.06f, 43f)
                arcTo(181.82f, 181.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 40f)
                arcTo(179.58f, 179.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.11f, 76.48f)
                arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.8f, 87.69f)
                lineTo(121.85f, 213.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.3f, 0f)
                lineToRelative(90.24f, -108.78f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 40.17f)
                quadToRelative(-4f, -0.16f, -8f, -0.17f)
                arcTo(179.58f, 179.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.11f, 76.48f)
                arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.8f, 87.69f)
                lineTo(121.85f, 213.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.3f, 0f)
                lineTo(191.49f, 144f)
            }
        }.build()

        return _WifiXDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WifiXDuotone: ImageVector? = null
