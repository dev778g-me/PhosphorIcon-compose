package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.FishSimpleDuotone: ImageVector
    get() {
        if (_FishSimpleDuotone != null) {
            return _FishSimpleDuotone!!
        }
        _FishSimpleDuotone = ImageVector.Builder(
            name = "Duotone.FishSimpleDuotone",
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
                moveTo(104.15f, 53.57f)
                curveTo(76f, 74.82f, 55.89f, 115.64f, 64.08f, 191.89f)
                curveToRelative(76.26f, 8.2f, 117.09f, -11.87f, 138.35f, -40f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104.15f, 53.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 76f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 183.87f)
                curveTo(272f, 240f, 220f, 38.7f, 219f, 37f)
                curveTo(217.29f, 36f, 16f, -16f, 72.1f, 240f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(202.45f, 151.85f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, -98.3f, -98.3f)
            }
        }.build()

        return _FishSimpleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FishSimpleDuotone: ImageVector? = null
