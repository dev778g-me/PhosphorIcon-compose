package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ShareFatFill: ImageVector
    get() {
        if (_ShareFatFill != null) {
            return _ShareFatFill!!
        }
        _ShareFatFill = ImageVector.Builder(
            name = "Filled.ShareFatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(237.66f, 117.66f)
                lineToRelative(-80f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 192f)
                verticalLineTo(152.23f)
                curveToRelative(-57.1f, 3.24f, -96.25f, 40.27f, -107.24f, 52f)
                horizontalLineToRelative(0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20.68f, -9.58f)
                curveToRelative(3.71f, -32.26f, 21.38f, -63.29f, 49.76f, -87.37f)
                curveToRelative(23.57f, -20f, 52.22f, -32.69f, 78.16f, -34.91f)
                verticalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineToRelative(80f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 237.66f, 117.66f)
                close()
            }
        }.build()

        return _ShareFatFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShareFatFill: ImageVector? = null
