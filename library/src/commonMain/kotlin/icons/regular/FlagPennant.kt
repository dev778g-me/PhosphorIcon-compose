package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.FlagPennant: ImageVector
    get() {
        if (_FlagPennant != null) {
            return _FlagPennant!!
        }
        _FlagPennant = ImageVector.Builder(
            name = "Regular.FlagPennant",
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
                moveTo(56f, 168f)
                lineToRelative(184f, -64f)
                lineToRelative(-184f, -64f)
                lineToRelative(0f, 176f)
            }
        }.build()

        return _FlagPennant!!
    }

@Suppress("ObjectPropertyName")
private var _FlagPennant: ImageVector? = null
