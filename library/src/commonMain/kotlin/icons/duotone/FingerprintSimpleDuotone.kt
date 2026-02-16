package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.FingerprintSimpleDuotone: ImageVector
    get() {
        if (_FingerprintSimpleDuotone != null) {
            return _FingerprintSimpleDuotone!!
        }
        _FingerprintSimpleDuotone = ImageVector.Builder(
            name = "Duotone.FingerprintSimpleDuotone",
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
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 128f)
                arcTo(239.33f, 239.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 158f, 219.21f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(163.75f, 96f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 128f)
                arcToRelative(143.41f, 143.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18f, 69.73f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 37.46f)
                arcTo(96.07f, 96.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                arcToRelative(288.93f, 288.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.14f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23.27f, 168f)
                arcTo(95.66f, 95.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 128f)
                arcTo(95.78f, 95.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 56.45f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(110.56f, 208f)
                quadToRelative(-3f, 6.63f, -6.57f, 13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                arcToRelative(192.77f, 192.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 48f)
            }
        }.build()

        return _FingerprintSimpleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FingerprintSimpleDuotone: ImageVector? = null
