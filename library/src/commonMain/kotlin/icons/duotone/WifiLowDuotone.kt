package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.WifiLowDuotone: ImageVector
    get() {
        if (_WifiLowDuotone != null) {
            return _WifiLowDuotone!!
        }
        _WifiLowDuotone = ImageVector.Builder(
            name = "Duotone.WifiLowDuotone",
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
                moveTo(84.32f, 167.88f)
                arcToRelative(68f, 68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 87.36f, 0f)
                lineToRelative(-37.53f, 45.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.3f, 0f)
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
                moveTo(84.32f, 167.88f)
                arcToRelative(68f, 68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 87.36f, 0f)
            }
        }.build()

        return _WifiLowDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WifiLowDuotone: ImageVector? = null
