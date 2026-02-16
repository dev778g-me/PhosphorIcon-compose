package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.FingerprintSimpleThin: ImageVector
    get() {
        if (_FingerprintSimpleThin != null) {
            return _FingerprintSimpleThin!!
        }
        _FingerprintSimpleThin = ImageVector.Builder(
            name = "Thin.FingerprintSimpleThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 128f)
                arcToRelative(239.32f, 239.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17.93f, 91.2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(163.77f, 96f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 128f)
                arcToRelative(143.3f, 143.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18f, 69.73f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 37.46f)
                arcTo(96.07f, 96.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                arcToRelative(288.93f, 288.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.14f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23.3f, 168f)
                arcTo(95.81f, 95.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 128f)
                arcTo(95.78f, 95.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 56.45f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(110.58f, 208f)
                quadToRelative(-3f, 6.63f, -6.57f, 13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                arcToRelative(192.3f, 192.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 48f)
            }
        }.build()

        return _FingerprintSimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _FingerprintSimpleThin: ImageVector? = null
