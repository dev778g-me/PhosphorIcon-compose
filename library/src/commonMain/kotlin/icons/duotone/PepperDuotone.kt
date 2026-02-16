package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.PepperDuotone: ImageVector
    get() {
        if (_PepperDuotone != null) {
            return _PepperDuotone!!
        }
        _PepperDuotone = ImageVector.Builder(
            name = "Duotone.PepperDuotone",
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
                moveTo(128f, 104f)
                lineToRelative(32f, -16f)
                lineToRelative(32f, 16f)
                lineToRelative(22.83f, -11.42f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -109.66f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 104f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -112f, 0f)
                curveToRelative(0f, 48.1f, -25.64f, 84f, -82.27f, 100.7f)
                curveToRelative(-8.11f, 2.39f, -7.43f, 14.11f, 0.9f, 15.58f)
                curveTo(88f, 231.84f, 216f, 222.48f, 216f, 104f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(105.17f, 92.58f)
                lineToRelative(22.83f, 11.42f)
                lineToRelative(32f, -16f)
                lineToRelative(32f, 16f)
                lineToRelative(22.84f, -11.42f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 16f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
            }
        }.build()

        return _PepperDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PepperDuotone: ImageVector? = null
