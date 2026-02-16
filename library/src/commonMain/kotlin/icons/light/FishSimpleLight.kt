package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.FishSimpleLight: ImageVector
    get() {
        if (_FishSimpleLight != null) {
            return _FishSimpleLight!!
        }
        _FishSimpleLight = ImageVector.Builder(
            name = "Light.FishSimpleLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 76f)
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
                moveTo(16f, 183.87f)
                curveTo(272f, 240f, 220f, 38.7f, 219f, 37f)
                curveTo(217.29f, 36f, 16f, -16f, 72.1f, 240f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(202.45f, 151.85f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, -98.3f, -98.3f)
            }
        }.build()

        return _FishSimpleLight!!
    }

@Suppress("ObjectPropertyName")
private var _FishSimpleLight: ImageVector? = null
