package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.FlagPennantBold: ImageVector
    get() {
        if (_FlagPennantBold != null) {
            return _FlagPennantBold!!
        }
        _FlagPennantBold = ImageVector.Builder(
            name = "Bold.FlagPennantBold",
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
                moveTo(56f, 168f)
                lineToRelative(184f, -64f)
                lineToRelative(-184f, -64f)
                lineToRelative(0f, 176f)
            }
        }.build()

        return _FlagPennantBold!!
    }

@Suppress("ObjectPropertyName")
private var _FlagPennantBold: ImageVector? = null
