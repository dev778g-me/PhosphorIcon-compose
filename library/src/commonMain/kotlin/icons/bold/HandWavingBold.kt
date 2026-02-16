package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.HandWavingBold: ImageVector
    get() {
        if (_HandWavingBold != null) {
            return _HandWavingBold!!
        }
        _HandWavingBold = ImageVector.Builder(
            name = "Bold.HandWavingBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96.65f, 62f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.64f, -20f)
                lineToRelative(30f, 52f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
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
                strokeLineWidth = 24f,
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
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(220.11f, 40.63f)
                arcToRelative(60.21f, 60.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -14f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(58.23f, 228f)
                arcToRelative(121f, 121f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18.16f, -24f)
            }
        }.build()

        return _HandWavingBold!!
    }

@Suppress("ObjectPropertyName")
private var _HandWavingBold: ImageVector? = null
