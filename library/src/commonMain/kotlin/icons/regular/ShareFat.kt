package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.ShareFat: ImageVector
    get() {
        if (_ShareFat != null) {
            return _ShareFat!!
        }
        _ShareFat = ImageVector.Builder(
            name = "Regular.ShareFat",
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
                moveTo(30.93f, 198.72f)
                curveTo(47.39f, 181.19f, 90.6f, 144f, 152f, 144f)
                verticalLineToRelative(48f)
                lineToRelative(80f, -80f)
                lineTo(152f, 32f)
                verticalLineTo(80f)
                curveTo(99.2f, 80f, 31.51f, 130.45f, 24f, 195.54f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 30.93f, 198.72f)
                close()
            }
        }.build()

        return _ShareFat!!
    }

@Suppress("ObjectPropertyName")
private var _ShareFat: ImageVector? = null
