package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.WifiMediumDuotone: ImageVector
    get() {
        if (_WifiMediumDuotone != null) {
            return _WifiMediumDuotone!!
        }
        _WifiMediumDuotone = ImageVector.Builder(
            name = "Duotone.WifiMediumDuotone",
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
                moveTo(121.85f, 213.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.3f, 0f)
                lineToRelative(68.18f, -82.18f)
                arcToRelative(116f, 116f, 0f, isMoreThanHalf = false, isPositiveArc = false, -148.66f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(134.15f, 213.12f)
                lineToRelative(104f, -125.43f)
                arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.31f, -11.21f)
                arcToRelative(180.75f, 180.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -217.78f, 0f)
                arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.8f, 87.69f)
                lineTo(121.85f, 213.12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 134.15f, 213.12f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(53.67f, 130.94f)
                arcToRelative(116f, 116f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148.66f, 0f)
            }
        }.build()

        return _WifiMediumDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WifiMediumDuotone: ImageVector? = null
