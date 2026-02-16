package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.FlagBannerFoldThin: ImageVector
    get() {
        if (_FlagBannerFoldThin != null) {
            return _FlagBannerFoldThin!!
        }
        _FlagBannerFoldThin = ImageVector.Builder(
            name = "Thin.FlagBannerFoldThin",
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
                moveTo(152f, 224f)
                lineToRelative(80f, -176f)
                lineToRelative(-80f, 0f)
                lineToRelative(-40f, 88f)
                lineToRelative(80f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 136f)
                lineToRelative(-10.91f, 24f)
                lineToRelative(-73.09f, 0f)
                lineToRelative(40f, -44f)
                lineToRelative(-40f, -44f)
                lineToRelative(113.09f, 0f)
            }
        }.build()

        return _FlagBannerFoldThin!!
    }

@Suppress("ObjectPropertyName")
private var _FlagBannerFoldThin: ImageVector? = null
