package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChatCircleSlashFill: ImageVector
    get() {
        if (_ChatCircleSlashFill != null) {
            return _ChatCircleSlashFill!!
        }
        _ChatCircleSlashFill = ImageVector.Builder(
            name = "Filled.ChatCircleSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineToRelative(-10.26f, -11.29f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = true, -112.7f, 9.73f)
                lineTo(45.07f, 231.17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20.24f, -20.24f)
                lineToRelative(11.35f, -34.05f)
                arcTo(104.06f, 104.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52.33f, 56.66f)
                lineTo(42.08f, 45.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.92f, 34.62f)
                close()
                moveTo(128f, 24f)
                arcToRelative(103.39f, 103.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40.33f, 8.11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.81f, 12.75f)
                lineToRelative(121.8f, 134f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, -1.59f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
            }
        }.build()

        return _ChatCircleSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatCircleSlashFill: ImageVector? = null
