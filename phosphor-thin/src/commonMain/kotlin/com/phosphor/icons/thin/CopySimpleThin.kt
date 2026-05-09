package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.CopySimpleThin: ImageVector
    get() {
        if (_CopySimpleThin != null) {
            return _CopySimpleThin!!
        }
        _CopySimpleThin = ImageVector.Builder(
            name = "Thin.CopySimpleThin",
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
                moveTo(40f, 72f)
                horizontalLineToRelative(144f)
                verticalLineToRelative(144f)
                horizontalLineToRelative(-144f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 40f)
                lineToRelative(144f, 0f)
                lineToRelative(0f, 144f)
            }
        }.build()

        return _CopySimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _CopySimpleThin: ImageVector? = null
