package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.DiamondsFourBold: ImageVector
    get() {
        if (_DiamondsFourBold != null) {
            return _DiamondsFourBold!!
        }
        _DiamondsFourBold = ImageVector.Builder(
            name = "Bold.DiamondsFourBold",
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
                moveTo(90f, 62f)
                lineToRelative(38f, -38f)
                lineToRelative(38f, 38f)
                lineToRelative(-38f, 38f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(90f, 194f)
                lineToRelative(38f, -38f)
                lineToRelative(38f, 38f)
                lineToRelative(-38f, 38f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 128f)
                lineToRelative(38f, -38f)
                lineToRelative(38f, 38f)
                lineToRelative(-38f, 38f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 128f)
                lineToRelative(38f, -38f)
                lineToRelative(38f, 38f)
                lineToRelative(-38f, 38f)
                close()
            }
        }.build()

        return _DiamondsFourBold!!
    }

@Suppress("ObjectPropertyName")
private var _DiamondsFourBold: ImageVector? = null
