package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.HandWavingDuotone: ImageVector
    get() {
        if (_HandWavingDuotone != null) {
            return _HandWavingDuotone!!
        }
        _HandWavingDuotone = ImageVector.Builder(
            name = "Duotone.HandWavingDuotone",
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
                moveTo(213.27f, 104f)
                lineTo(196f, 74f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -34.64f, 20f)
                lineToRelative(-30f, -52f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96.65f, 62f)
                horizontalLineToRelative(0f)
                lineTo(89.73f, 50f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 55.08f, 70f)
                lineTo(69.32f, 94.67f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -34.64f, 20f)
                lineTo(74.7f, 184f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 138.57f, -80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96.65f, 62f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.64f, -20f)
                lineToRelative(30f, 52f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(69.32f, 94.67f)
                lineTo(55.08f, 70f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.73f, 50f)
                lineToRelative(31.17f, 54f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(158.87f, 160f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 105.58f)
                lineTo(161.32f, 94f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 196f, 74f)
                lineToRelative(17.31f, 30f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 74.7f, 184f)
                lineToRelative(-40f, -69.32f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.64f, -20f)
                lineTo(88.57f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 33.78f)
                arcTo(51.84f, 51.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.67f, 58f)
                lineToRelative(0.33f, 0.57f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(74.62f, 232f)
                arcTo(111.88f, 111.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47f, 200f)
            }
        }.build()

        return _HandWavingDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HandWavingDuotone: ImageVector? = null
