package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.FlagBannerBold: ImageVector
    get() {
        if (_FlagBannerBold != null) {
            return _FlagBannerBold!!
        }
        _FlagBannerBold = ImageVector.Builder(
            name = "Bold.FlagBannerBold",
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
                moveTo(152f, 224f)
                lineToRelative(80f, -168f)
                lineToRelative(-192f, 0f)
                lineToRelative(48f, 48f)
                lineToRelative(-48f, 48f)
                lineToRelative(146.29f, 0f)
            }
        }.build()

        return _FlagBannerBold!!
    }

@Suppress("ObjectPropertyName")
private var _FlagBannerBold: ImageVector? = null
