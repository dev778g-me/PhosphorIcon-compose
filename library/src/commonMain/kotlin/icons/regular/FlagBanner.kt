package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.FlagBanner: ImageVector
    get() {
        if (_FlagBanner != null) {
            return _FlagBanner!!
        }
        _FlagBanner = ImageVector.Builder(
            name = "Regular.FlagBanner",
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
                moveTo(152f, 224f)
                lineToRelative(80f, -168f)
                lineToRelative(-192f, 0f)
                lineToRelative(48f, 48f)
                lineToRelative(-48f, 48f)
                lineToRelative(146.29f, 0f)
            }
        }.build()

        return _FlagBanner!!
    }

@Suppress("ObjectPropertyName")
private var _FlagBanner: ImageVector? = null
