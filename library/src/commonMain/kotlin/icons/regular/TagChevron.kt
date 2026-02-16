package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.TagChevron: ImageVector
    get() {
        if (_TagChevron != null) {
            return _TagChevron!!
        }
        _TagChevron = ImageVector.Builder(
            name = "Regular.TagChevron",
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
                moveTo(32f, 200f)
                horizontalLineTo(187.72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.65f, -3.56f)
                lineTo(240f, 128f)
                lineTo(194.37f, 59.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.72f, 56f)
                horizontalLineTo(32f)
                lineToRelative(48f, 72f)
                close()
            }
        }.build()

        return _TagChevron!!
    }

@Suppress("ObjectPropertyName")
private var _TagChevron: ImageVector? = null
