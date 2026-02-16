package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.CopySimple: ImageVector
    get() {
        if (_CopySimple != null) {
            return _CopySimple!!
        }
        _CopySimple = ImageVector.Builder(
            name = "Regular.CopySimple",
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
                moveTo(40f, 72f)
                horizontalLineToRelative(144f)
                verticalLineToRelative(144f)
                horizontalLineToRelative(-144f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 40f)
                lineToRelative(144f, 0f)
                lineToRelative(0f, 144f)
            }
        }.build()

        return _CopySimple!!
    }

@Suppress("ObjectPropertyName")
private var _CopySimple: ImageVector? = null
