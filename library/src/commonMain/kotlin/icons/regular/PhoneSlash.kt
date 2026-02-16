package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.PhoneSlash: ImageVector
    get() {
        if (_PhoneSlash != null) {
            return _PhoneSlash!!
        }
        _PhoneSlash = ImageVector.Builder(
            name = "Regular.PhoneSlash",
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
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120.51f, 72.19f)
                curveToRelative(38.15f, -2f, 77f, 11.23f, 105.43f, 39.64f)
                curveToRelative(17.29f, 17.29f, 18.63f, 42.29f, 4f, 61.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.26f, 2.47f)
                lineToRelative(-9.37f, -3.32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(114.45f, 113.09f)
                arcToRelative(83.51f, 83.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.18f, 3.6f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.12f, 6f)
                lineToRelative(-5.9f, 29.51f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84.38f, 158f)
                lineTo(35.29f, 175.42f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26f, 173f)
                curveToRelative(-14.6f, -18.83f, -13.26f, -43.83f, 4f, -61.12f)
                arcTo(135.14f, 135.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 83.53f, 79.08f)
            }
        }.build()

        return _PhoneSlash!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneSlash: ImageVector? = null
